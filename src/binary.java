import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class binary {



      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
     }


    static List<Integer> result;

    private static void traversePostOrder(TreeNode node) {
        if (node == null) return;
        if (node.left != null) {
            traversePostOrder(node.left);
        }
        if (node.right != null) {
            traversePostOrder(node.right);
        }
        System.out.println(node.val);
        result.add(node.val);

    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        traversePostOrder(root);

        return result;
    }

    public static void main(String[] args) {
        /*TreeNode root = new TreeNode(10);
        TreeNode node5 = new TreeNode(5);
        TreeNode node20 = new TreeNode(20);
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node15 = new TreeNode(15);
        TreeNode node25 = new TreeNode(25);

        // Connecting nodes
        root.left = node5;
        root.right = node20;
        node5.left = node3;
        node5.right = node7;
        node20.left = node15;
        node20.right = node25;*/

        TreeNode root = new TreeNode(1);
        TreeNode node2 = null; // Le deuxième nœud est null car il n'a pas d'enfant gauche
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);

        // Relier les nœuds
        root.right = node2;
        root.right = node3;
        node3.left = node4;


        System.out.println(postorderTraversal(root));
    }
}

