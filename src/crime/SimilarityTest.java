package crime;

import java.util.ArrayList;
import uk.ac.shef.wit.simmetrics.similaritymetrics.JaroWinkler;

public class SimilarityTest {

    public static void main(String[] args) {
        String input = "rams#babuas#k.rambabu093@gmail.com#87665444344324#31/01/2014##";
        ArrayList<String> arrayList = getData();
        ArrayList<StatusDTO> statusList = new ArrayList<StatusDTO>();
        for (String string : arrayList) {
            statusList.add(calculateLinkType(input, string));
        }
        for (StatusDTO statusDTO : statusList) {
            System.out.print("Z = " + statusDTO.getZ());
            System.out.print("\t\tLinktype =   " + statusDTO.getLinktype());
            System.out.print("\t\tScore =   " + (Double.parseDouble(statusDTO.getWeight()) / (double) 100));
            System.out.print("\t\t\tLink = " + statusDTO.getLink());
            System.out.println("");
            System.out.println("");
        }
    }

    public static ArrayList<StatusDTO> find(String input, ArrayList<String> arrayList) {
        ArrayList<StatusDTO> statusList = new ArrayList<StatusDTO>();
        for (String string : arrayList) {
            statusList.add(calculateLinkType(input, string));
        }
        return statusList;
    }

    public static double compareToken(String stringA, String stringB) {
        JaroWinkler algorithm = new JaroWinkler();
        return algorithm.getSimilarity(stringA, stringB) * 100;
    }

    public static StatusDTO calculateLinkType(String stringA, String stringB) {
        StatusDTO statusDTO = new StatusDTO();
        double weight = compareToken(stringA, stringB); /// weight of string
        String link = ""; // link 
        int z = 0; // link weight

        JaroWinkler algorithm = new JaroWinkler();
        String[] splitA = stringA.split("#");
        String[] splitB = stringB.split("#");
        int min = splitA.length > splitB.length ? splitB.length : splitA.length;
        for (int index = 0; index < min; index++) {
            int type = algorithm.getSimilarity(splitA[index], splitB[index]) > .82 ? 1 : 0;
            link = link + type + "";
            z = z + type;
        }
        statusDTO.setLink(stringB);
        statusDTO.setLinktype(link);
        statusDTO.setWeight(weight + "");
        statusDTO.setZ(z + "");
        return statusDTO;
    }

    public static ArrayList<String> getData() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("##12123@ggg.ccc#43243432##m#"); //0
        arrayList.add("rambabu#koduru#k.rambabu09@gmail.com#9595193887#12/11/1989#m#"); //1
        arrayList.add("rams#babuas#k.rambabu093@gmail.com#546512423232#31/01/2014##"); // 2
        arrayList.add("rams#babuas#k.rambabu093@gmail.com#87665444344324#31/01/2014##"); // 3
        arrayList.add("rams#babuas#k.rambabu0932@gmail.com#852363963#31/01/2014#m#"); // 4
        arrayList.add("rams1#babuas1#k.rambabu094@gmail.com#852363963#31/01/2014#f#hyderabad punjagutta"); // 5
        arrayList.add("pravin#tumsare#pravin@gmail.com#213243435464467###"); // 6
        arrayList.add("rambabu##k.rambabu0009@gmail.com#764542344342343#31/01/2014##"); // 7
        arrayList.add("James#Bond 007#k.rambabu09@gmail.com#7412589632#03/02/2000#f#hyderabads"); // 8
        arrayList.add("123#123#pravin.t@vsil.com#123456###123123"); // 9
        return arrayList;
    }
}
