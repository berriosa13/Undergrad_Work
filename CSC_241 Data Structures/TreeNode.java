package ClassCode;

public class TreeNode<T> {
    T data;	//data
    int parent;	//parent node id

    public TreeNode() {	}
    public TreeNode(T data,int parent){
        this.data=data;
        this.parent=parent;
    }

    @Override
    public String toString() {
        return this.data+"";
    }
}
