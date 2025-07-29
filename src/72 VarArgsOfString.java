 class VarArgsOfString {
    public static void main(String[] args) {

        System.out.println(concatenate("Adi"));
        System.out.println(concatenate("Adi" ,"Ingole"));
        System.out.println(concatenate("Adi","Ingole","From","Pune"));
    }

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
