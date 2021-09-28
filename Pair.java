public class Pair<E1, E2>{
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
}