import java.util.ArrayList;

public class NaverHackDay2 {

    public class Tree {
        public int x;
        public Tree left=null;
        public Tree right=null;

        public Tree(int x){
            this.setValue(x);
            setLeft(null);
            setRight(null);
        }
        public int getData(){return x;}
        public void setValue(int x){this.x = x;}
        public Tree getLeft() {return left;}
        public void setLeft(Tree left) { this.left = left;}
        public Tree getRight() {return right;}
        public void setRight(Tree right) {this.right = right;}
    }



    public int solution(Tree T) {
        // write your code in Java SE 8

//        Tree root = null;
//        Tree current = root;
//        while(current != null){
//            if(current.getLeft() < current.getRight()){
//
//            }
//        }
        int depth = 0;

        ArrayList<Integer> array = new ArrayList<>();

        /*for(int i=0; i<array.size(); i++){
            if(T.getLeft() < T.getRight()){
                array.add(T.getRight());
                depth++;
            } else {
                array.add(T.getLeft());
                depth++;
            }
        }*/



        return -1;
    }



    public static void main(String[] args) {
        NaverHackDay2 test = new NaverHackDay2();
    }
}
