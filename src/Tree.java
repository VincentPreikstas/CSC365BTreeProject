import java.math.BigDecimal;

public class Tree {
    private int degree = 3;
    TreeNode root;

    //Tree constructor with no degree specified (base Degree 3)
    public Tree(){
        root = new TreeNode(degree);
    }
    //Tree constructor with specified Degree
    public Tree(int degree){
        this.degree = degree;
        root = new TreeNode(this.degree);
    }

    public int getDegree(){
        return degree;
    }

    public void displayTree(TreeNode root, int currentdepth){
        System.out.print("This node's keys are");
        int counter = 0;
        for (BigDecimal thebd: root.keys){
            if (thebd != null && counter < root.numberOfKeys){
                System.out.print("  :  " + thebd);
                counter++;

            }

        }
        System.out.print("   ||   There are " + root.numberOfKeys + " of them.");

        System.out.println("\nThis node is at depth: " + currentdepth + "\n");
        for (TreeNode child: root.children){
            if (child != null){
                displayTree(child, currentdepth + 1);
            }
        }
    }

    public boolean insert (TreeNode root, BigDecimal key){
        if (checkSearch(root, key)){
            return false;
        }
        TreeNode rootNode = root;
        if (root.numberOfKeys == (2 * degree) - 1){
            TreeNode newNode = new TreeNode(degree);
            this.root = newNode;
            newNode.leaf = false;
            newNode.children[0] = rootNode;
            BTreeSplitChild(this.root, 0);
            BTreeInsertNonFull(newNode, key);
            return true;
        } else {
            BTreeInsertNonFull(rootNode, key);
            return true;
        }


    }

    public void BTreeInsertNonFull(TreeNode insertionNode, BigDecimal key){
        int keyNum = insertionNode.numberOfKeys;
        if (insertionNode.leaf){
            //if (insertionNode.numberOfKeys != 0) {
                while (keyNum > 0 && key.compareTo(insertionNode.keys[keyNum - 1]) == -1) {
                    insertionNode.keys[keyNum] = insertionNode.keys[keyNum - 1];
                    keyNum--;
                }
                insertionNode.keys[keyNum] = key;
                insertionNode.numberOfKeys = insertionNode.numberOfKeys + 1;
            //} else {
                //insertionNode.keys[0] = key;
                //insertionNode.numberOfKeys = insertionNode.numberOfKeys + 1;
            //}
        } else {
            while (keyNum > 0 && key.compareTo(insertionNode.keys[keyNum - 1]) == -1) {
                keyNum --;
            }
            //keyNum ++;
            if (insertionNode.children[keyNum].numberOfKeys == (2 * degree) - 1){
                BTreeSplitChild(insertionNode, keyNum);
                if (key.compareTo(insertionNode.keys[keyNum]) == 1){
                    keyNum ++;
                }
            }
            BTreeInsertNonFull(insertionNode.children[keyNum], key);

        }
    }


    public void BTreeSplitChild(TreeNode rootNode, int index){
        TreeNode newRightNode = new TreeNode(degree);
        newRightNode.leaf = rootNode.children[index].leaf;
        newRightNode.numberOfKeys = degree - 1;
        for (int i = 0; i <= degree - 2; i++){
            newRightNode.keys[i] = rootNode.children[index].keys[i + degree];
            //maybe delete keys from node to split here
            //rootNode.children[index].keys[i + degree] = null;
        }
        if (!rootNode.children[index].leaf){
            for (int i = 0; i <= degree - 1; i++){
                newRightNode.children[i] = rootNode.children[index].children[i + degree];
            }
        }
        rootNode.children[index].numberOfKeys = degree - 1;
        for (int i = rootNode.numberOfKeys; i >= index; i--){
            rootNode.children[i + 1] = rootNode.children[i];
        }
        //here might not be the right index
        rootNode.children[index + 1] = newRightNode;
        for (int i = rootNode.numberOfKeys; i >= index; i--){
            rootNode.keys[i + 1] = rootNode.keys[i];
        }
        //HEREERE
        rootNode.keys[index] = rootNode.children[index].keys[degree - 1];
        rootNode.numberOfKeys = rootNode.numberOfKeys + 1;

    }

    public boolean checkSearch(TreeNode root, BigDecimal key){
        int i = 0;
        while(i < root.numberOfKeys && key.compareTo(root.keys[i]) == 1){
            i++;
        }
        if (i < root.numberOfKeys && key.compareTo(root.keys[i]) == 0){
            return true;
        } else if (root.leaf == true){
            return false;
        } else {
            return checkSearch(root.children[i], key);
        }
    }

    public Helper BTreeSearch(TreeNode root, BigDecimal key){
        Helper dataToReturn;
        int i = 0;
        while(i < root.numberOfKeys && key.compareTo(root.keys[i]) == 1){
            i++;
        }
        if (i < root.numberOfKeys && key.compareTo(root.keys[i]) == 0){
            dataToReturn = new Helper(root, i);
            return dataToReturn;
        } else if (root.leaf == true){
            return null;
        } else {
            return BTreeSearch(root.children[i], key);
        }

    }

}

class TreeNode {
    TreeNode parent;
    int numberOfKeys;
    boolean leaf;
    BigDecimal[] keys;
    TreeNode[] children;

    public TreeNode(int degree){

        numberOfKeys = 0;

        //so this case when its a leaf? only when fist root though??
        leaf = true;
        //with 3 creating array of size 5
        //keys = new BigDecimal[(2 * degree) - 1];
        keys = new BigDecimal[(2 * degree)];
        //with 3 creating array of size 6
        children = new TreeNode[(2 * degree) + 1];
        //children = new TreeNode[(2 * degree)];

    }

    public TreeNode (BigDecimal key){
        numberOfKeys = 1;
        leaf = false;
        keys[0] = key;
    }

    public TreeNode (BigDecimal key, TreeNode root){

    }


}


class Helper {
    TreeNode theNode;
    int theIndex;

    public Helper(TreeNode theNode, int theIndex){
        this.theNode = theNode;
        this.theIndex = theIndex;
    }
}