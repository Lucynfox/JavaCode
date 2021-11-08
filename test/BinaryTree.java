package test;

public class BinaryTree {
	public static void main(String[] args) {
		IsPerfectBinaryTree(5);
	}

	private static void IsPerfectBinaryTree(int root) {
		// TODO Auto-generated method stub
		if(root.left == null && root.right == null) {
			return true;
		}
		if((root.left != null && root.right ==null)|| (root.left == null && root.right !=null)) {
			return false;
		}
		return isPerfectBinaryTree(root.left) && isPerfectBinaryTree(root.right) == true;
	
		}
		
		
	}

