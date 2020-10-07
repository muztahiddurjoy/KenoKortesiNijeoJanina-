import java.util.*;

public class FutureWifiDetector {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ramisa","Tania","Soniya","Alfi","Oishi","Sumaiya","Maisha","Sujana","Jannat","Tamanna","Mim","Akhi","Tasnim","Tanha","suraiya","hafsa","muntaha","israt","sumi","shorna","atika","anushka","faiza","rifa","adiba","lamia","nafisa","ridi","preya","pushpita","oditi","fabiha","perona","mansura","sharmin","tanjila","samia","Bamun Thakur","Sefat Ullah","No One","Nosibe bou nai");
        //Specially Thanks to Anisha Ontie (Khunti)
        //Meyeder naamer etto boro ekta list banay deyar jonno
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println(name+", The name of your future wife is: "+arrayList.get(random.nextInt(41)));

    }
}
