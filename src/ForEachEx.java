public class ForEachEx {
    public static void main() {
//        String[] nameArray = {"Matei", "ALexandra", "Eugen"};
//        for(String name : nameArray){
//            System.out.println(name);
//        }

//        for(int i = 0; i < 100; i++){
//            if(i == 10) break;
//            System.out.println("i: " +  i);
//        }
//        System.out.println("Bucla terminata");
        int nmax = 25;
        for(int n = 0; n < nmax; n++){
            if((n*n)>=nmax) break;
            System.out.println("n este egal cu " + n + " , n la patrat este egal cu " + n*n);
        }
        System.out.println("Sfarsitul buclei");
    }

}
