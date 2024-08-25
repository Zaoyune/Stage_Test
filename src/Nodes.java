import jdk.nashorn.internal.objects.Global;

import java.awt.*;
import java.awt.event.InputEvent;

public class Nodes {

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
      static int GoodNode(TreeNode root, int goodNode, int NodesNumber){
          if (root != null) {
              if (root.val >= goodNode) {
                  NodesNumber++;
                  goodNode = root.val;
              }

              NodesNumber = GoodNode(root.right, goodNode, NodesNumber);
              NodesNumber = GoodNode(root.left, goodNode, NodesNumber);
          }

          return NodesNumber;
      }
    public static int goodNodes(TreeNode root) {
        int goodNode = root.val;
        int nodeNumbers = 0;
        System.out.println(GoodNode(root,goodNode,nodeNumbers));
        return GoodNode(root,goodNode,nodeNumbers);
    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(10,null,null);
        TreeNode t4 = new TreeNode(2,null,null);
        TreeNode t1 = new TreeNode(1,null,null);
        TreeNode t2 = new TreeNode(4,null,null);
        TreeNode treeNodeLeft = new TreeNode(3,t2,t4);
        TreeNode treeNodeRight = new TreeNode(4,t1,t4);
        TreeNode treeNode = new TreeNode(3,treeNodeLeft,null);
        goodNodes(treeNode);
    }
}


