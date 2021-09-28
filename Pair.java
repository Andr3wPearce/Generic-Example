public class Pair<E1 extends Comparable, E2 extends Comparable> implements Comparable<Pair>{
    private E1 first;
    private E2 second;

    public Pair(){
        first=null;
        second = null;
    }

    public Pair(E1 f, E2 s){
        first = f;
        second = s;
    }
    public E1 getFirst(){
        return first;
    }
    public void setFirst(E1 f){
        first=f;
    }
    public E2 getSecond(){
        return second;
    }
    public void getSecond(E2 s){
        second = s;
    }
    public String toString(){
        return "("+first+", "+second+")";
    }
    public boolean equals(Object o){
        if(o instanceof Pair){
            Pair<E1, E2> p = (Pair<E1, E2>) o;
            boolean eq1 = this.first.equals(p.getFirst());
            boolean eq2 = this.second.equals(p.getSecond());
            return eq1 && eq2;
        }
        return false;
    }
    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;
        for(int i=0; i<list.length-1; i++){
            currentMinIndex = i;
            currentMin = list[i];
            for(int j=i+1; j<list.length; j++){
                if(currentMin.compareTo((list[j]))>0){
                    currentMinIndex = j;
                    currentMin=list[j];
                }
            }
            if(i!=currentMinIndex){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    @Override
    public int compareTo(Pair p) {
        return this.first.compareTo(p.first)+this.second.compareTo(p.second);
    }
}