import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Notebook gamingNotebook = new Notebook();
        gamingNotebook.name = "gamingNotebook";
        gamingNotebook.brand = "DELL";
        gamingNotebook.price = "100000";
        gamingNotebook.capasityOfRAM = "32";
        gamingNotebook.storageCapasity = "2000";
        gamingNotebook.setSpec();


        Notebook cheapNotebook = new Notebook();
        cheapNotebook.name = "cheapNotebook";
        cheapNotebook.brand = "HP";
        cheapNotebook.price = "30000";
        cheapNotebook.capasityOfRAM = "8";
        cheapNotebook.storageCapasity = "256";
        cheapNotebook.setSpec();


        Notebook workingNotebook = new Notebook();
        workingNotebook.name = "workingNotebook";
        workingNotebook.brand = "ACER";
        workingNotebook.price = "60000";
        workingNotebook.capasityOfRAM = "16";
        workingNotebook.storageCapasity = "1000";
        workingNotebook.setSpec();


        List<Notebook> listOfNotebooks = new ArrayList<>();
        listOfNotebooks.add(gamingNotebook);
        listOfNotebooks.add(cheapNotebook);
        listOfNotebooks.add(workingNotebook);

        List<String> keyList = new ArrayList<String>();
        Map<String, String> requestPull = requestAndSort();
        for (Map.Entry<String, String> key: requestPull.entrySet()
        ) {
            keyList.add(key.getKey());
        }

        System.out.print(comparator(listOfNotebooks,requestPull,keyList));



    }
    public static Map<String, String> requestAndSort() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> request = new LinkedHashMap<String, String>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите цифру интересующего вас параметра:\n1-Бренд\n2-Цена" +
                    "\n3-Объём оперативной памяти\n4-Объем накопителя\n5-Завершить подбор ");
            String id = scanner.nextLine();
            if (id.equalsIgnoreCase("5")) break;
            System.out.print("Введите значение для указанного параметрa \n(если значение числовое, то введите минимальное)");
            String value = scanner.nextLine();
            switch (id){
                case "1" -> request.put("brand",value);
                case "2"-> request.put("price",value);
                case "3" -> request.put("capasityOfRAM",value);
                case "4"-> request.put("storageCapasity",value);
            }
        }

        return request;
    }
    public static List<String> comparator(List<Notebook> listNote, Map<String, String> request, List<String> keyList){
        List<String> answerList = new ArrayList<String>();

        for (int i = 0; i < listNote.size(); i++) {
            int counter = 0;
            for (int j = 0; j < keyList.size(); j++) {
                switch (keyList.get(j)){
                    case "brand" -> {
                        String requstParametr = request.get(keyList.get(j));
                        System.out.println(requstParametr);
                        String notebookParametr = listNote.get(i).getSpecs().get(keyList.get(j));
                        System.out.println(notebookParametr);
                        if(!requstParametr.equalsIgnoreCase(notebookParametr)) counter++;
                    }
                    case "price" -> {
                        int requstParametr = Integer.parseInt(request.get(keyList.get(j))) ;
                        int notebookParametr = Integer.parseInt( listNote.get(i).getSpecs().get(keyList.get(j)));
                        if(! (requstParametr <= notebookParametr)) counter++;
                    }
                    case "capasityOfRAM" -> {
                        int requstParametr = Integer.parseInt(request.get(keyList.get(j))) ;
                        int notebookParametr = Integer.parseInt( listNote.get(i).getSpecs().get(keyList.get(j)));
                        if(! (requstParametr <= notebookParametr)) counter++;
                    }
                    case "storageCapasity" -> {
                        int requstParametr = Integer.parseInt(request.get(keyList.get(j))) ;
                        int notebookParametr = Integer.parseInt( listNote.get(i).getSpecs().get(keyList.get(j)));
                        if(! (requstParametr <= notebookParametr)) counter++;
                    }
                }
                System.out.println(counter);
                if (counter>0) break;
                answerList.add(listNote.get(i).getName());
            }
        }
        return answerList;
    }
}






