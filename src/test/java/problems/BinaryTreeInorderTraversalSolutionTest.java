package problems;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeInorderTraversalSolutionTest {
    BinaryTreeInorderTraversalSolution solution = new BinaryTreeInorderTraversalSolution();

    @Test
    public void inorderTraversalTest_1() {
        TreeNode root = new TreeNode(1,
                null, new TreeNode(2, new TreeNode(3),
                null));
        List<Integer> expected = List.of(1, 3, 2);
        List<Integer> actual = solution.inorderTraversal(root);
        assertEquals(expected, actual);
    }

    @Test
    public void inorderTraversalTest_2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5,
                                new TreeNode(6),
                                new TreeNode(7))
                ),
                new TreeNode(3,
                        null,
                        new TreeNode(8,
                                new TreeNode(9),
                                null)
                )
        );
        List<Integer> expected = List.of(4, 2, 6, 5, 7, 1, 3, 9, 8);
        List<Integer> actual = solution.inorderTraversal(root);
        assertEquals(expected, actual);
    }

    @Test
    public void inorderTraversalTest_3() {
        TreeNode root = null;
        List<Integer> expected = List.of();
        List<Integer> actual = solution.inorderTraversal(root);
        assertEquals(expected, actual);
    }

    @Test
    public void inorderTraversalTest_4() {
        TreeNode root = new TreeNode(1);
        List<Integer> expected = List.of(1);
        List<Integer> actual = solution.inorderTraversal(root);
        assertEquals(expected, actual);
    }
}
