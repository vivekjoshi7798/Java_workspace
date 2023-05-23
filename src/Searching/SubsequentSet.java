package Searching;

public class SubsequentSet {
    public static void main(String[] args) {
        int index=0;
        int superSet[]={11,12,13,14,15};
        int aSet[]={12,13,14};
        int cSet[]={11,12,13};
        int bSet[]={13,14,11};
        checkSubsequentSet(superSet,aSet);
        checkSubsequentSet(superSet,bSet);
        checkSubsequentSet(superSet,cSet);
    }

    private static void checkSubsequentSet(int[] superSet, int[] aSet) {
        int index=0;
        for (int i = 0; i < aSet.length; i++) {
            for (int j = index; j < superSet.length; j++) {
                if(aSet[i]==superSet[j]){
                    index=j;
                    aSet[i]=0;
                    break;
                }
            }
        }
        int flag=0;
        for (int i = 0; i < aSet.length; i++) {
            if (aSet[i]!=0){
                System.out.println("Set is not subsequent set");
                flag=1;
            }
        }
        if (flag==0){
            System.out.println("Set is subsequent set");

        }
    }
}
