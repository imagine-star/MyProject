package Question;

public class BinaryTreeDeep {

    public static void main(String[] args) {

        TreeNode treeLeft = new TreeNode(15);
        TreeNode treeRight = new TreeNode(7);
        treeRight = new TreeNode(20, treeLeft, treeRight);
        treeLeft = new TreeNode(9);
        TreeNode treeNode = new TreeNode(3, treeLeft, treeRight);

        Solution solution = new Solution();
        System.out.println(solution.maxDepth(treeNode));

    }

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

    static class Solution {

        public int maxDepth(TreeNode root) {

            if (root == null) {
                return 0;
            }

            int deep = 1;
            deep = getDeep(root, deep);
            return deep;

        }

        public int getDeep(TreeNode node, int deep) {

            if (node.left != null && node.right != null) {
                return Math.max(getDeep(node.left, deep), getDeep(node.right, deep)) + 1;
            } else if (node.left != null) {
                return getDeep(node.left, deep) + 1;
            } else if (node.right != null) {
                return getDeep(node.right, deep) + 1;
            } else {
                return 1;
            }

        }

    }

}
