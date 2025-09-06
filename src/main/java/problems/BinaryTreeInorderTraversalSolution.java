package problems;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalSolution {
    private static void get(TreeNode root, List<Integer> list) {
        if(root != null){
            get(root.left, list);
            list.add(root.val);
            get(root.right, list);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        get(root, result);
        return result;
    }
}
