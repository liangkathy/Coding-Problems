 //depth first search (recursive)
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        if (root == null) return result;

        String currentPath = Integer.toString(root.val);

        //if root does not have any children
        if (root.left == null && root.right == null)  result.add(currentPath);
        //otherwise pass root child through helper method
        if (root.left != null) dfs(root.left, currentPath, result);
        if (root.right != null) dfs(root.right, currentPath, result);


        return result;
    }

    //helper method to add each node to string
    public void dfs(TreeNode node, String currentPath, List<String> result){
        currentPath += "->" + node.val; //add arrow and node value to string
        
        //if node does not have children
        if (node.left == null && node.right == null) {
            result.add(currentPath);
            return;
        }
        //if node does have children, it also needs to be added to the string with arrow
        if (node.left != null) dfs(node.left, currentPath, result);
        if (node.right != null) dfs(node.right, currentPath, result);
    }
}
