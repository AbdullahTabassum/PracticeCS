package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintLevelByLevel {

    private static List<List<TreeNode>> getLevelByLevel(TreeNode root) {

        List<List<TreeNode>> levels = new ArrayList<List<TreeNode>>();

        Queue<TreeNode> current = new LinkedList<TreeNode>();
        List<TreeNode> currentLevel = new ArrayList<TreeNode>();
        Queue<TreeNode> next = new LinkedList<TreeNode>();

        current.add(root);

        //add root to queue
        while (!current.isEmpty()) {

            TreeNode c = ((LinkedList<TreeNode>) current).pop();
            currentLevel.add(c);

            //add children to next queue
            if (c.left != null)
                next.add(c.left);

            if (c.right != null)
                next.add(c.right);

            //if the current queue is empty, that means that we have finished the current row
            //now set the current row to the next row, and then repeat
            if (current.isEmpty()) {
                current = next;
                levels.add(currentLevel);
                currentLevel = new ArrayList<>();
                next = new LinkedList<>();
            }

        }

        return levels;
    }

    public static void printLevelByLevel() {
        //create a tree structure
        TreeNode tn1 = new TreeNode(1);

        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(3);

        //tn1 children
        tn1.setDec(tn2, tn3);

        //tn2 children
        TreeNode tn4 = new TreeNode(4);
        TreeNode tn5 = new TreeNode(5);
        tn2.setDec(tn4, tn5);

        //tn3 children
        TreeNode tn6 = new TreeNode(6);
        TreeNode tn7 = new TreeNode(7);
        tn3.setDec(tn6, tn7);

        //tn5 tn7 children
        TreeNode tn8 = new TreeNode(8);
        TreeNode tn9 = new TreeNode(9);

        tn5.setLeft(tn8);
        tn7.setRight(tn9);

        List<List<TreeNode>> levels = getLevelByLevel(tn1);

        for (List<TreeNode> level : levels) {

            for (TreeNode node : level) {
                System.out.print(" - " + node.value + " - ");
            }

            System.out.println("###");
        }
    }
}
