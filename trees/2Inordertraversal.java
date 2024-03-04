package trees;

public class 2Inordertraversal {
    static ArrayList < Integer > inOrderTrav(Node curr) {
        ArrayList < Integer > inOrder = new ArrayList < > ();
        Stack < Node > s = new Stack < > ();
        while (true) {
            if (curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                if (s.isEmpty()) break;
                curr = s.peek();
                inOrder.add(curr.data);
                s.pop();
                curr = curr.right;
            }
        }
        return inOrder;
}


/////////////////////////////// RECURSION     /////////////////////////////

// void inOrderTrav(node * curr, vector < int > & inOrder) {
//     if (curr == NULL)
//       return;
  
//     inOrderTrav(curr -> left, inOrder);
//     inOrder.push_back(curr -> data);
//     inOrderTrav(curr -> right, inOrder);
//   }