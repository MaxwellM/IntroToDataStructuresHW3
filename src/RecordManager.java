/**
 * Created with IntelliJ IDEA.
 * User: Maxwell
 * Date: 11/4/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecordManager {
	
	//The k value(maxChildren) for the k-ary search tree
	public int k;
	
	public Node root;
	
	public RecordManager(int k){
		this.k = k;
		System.out.println();
		//System.out.println("New Record Manager Created with a Value of : " + k);
	}
	
	public Node getRoot(){
		return this.root;
	}
	public void setRoot(Node root){
		this.root = root;
	}
	
	public boolean exists(int k){
		return (search(k) != null);
	}
	
	//Searches the tree for the given key and returns the node otherwise null
	public Node search(int k){
		if(root == null){
			return null;
		}else{
			if(k == root.k){
				return root;
			}else{
				return this.searchChildren(k,root);
			}
		}
	}
	
	//Search the children of the current node
	//And see if any of them have a matching k value
	public Node searchChildren(int k, Node node){
		if(node.k == k){
			return node;
		}
		Node res = null;
		for(int i = 0;i<node.getNumberOfChildren();i++){
			res = this.searchChildren(k, node.getChildAt(i));
			if(res != null){
				return res;
			}
		}
		return res;
	}
	
	//Insert new node with the value k and data d
	public void insert(int k, float d){
		if(root == null){
			//Create the root if one doesn't exist
			Node temp = new Node(this.k);
			this.root = temp;
			root.setValues(k, d);
		}else{
			//Search the tree to see if the value of k already exists
			if(!this.exists(k)){
				//If it doesn't then we can add this new node
				
				//This should always return some node, there is
				//Always more room to add nodes
				Node node = this.getFirstSpace(root);
				//Create new node
				Node temp = new Node(this.k);
				temp.setValues(k, d);
				node.addChild(temp);
			}else{
				//if the key already exists in replace it
				Node node = this.search(k);
				node.setValues(k, d);
			}
		}
	}
	
	//Get the first not full child of root
	//If the root has not empty spaces left then get the first
	//empty space of the leftmost node in the tree
	private Node getFirstSpace(Node node){
		if(!node.isFull()){
			//We can use this node
			return node;
		}else{
			//Otherwise we need to keep searching to see if all
			//Of the children related to this node are full
			//This somewhat balances the tree and leads to
			//A "complete" appearance to the tree
			for(int i = 0;i<node.getNumberOfChildren();i++){
				if(!node.getChildAt(i).isFull()){
					return node.getChildAt(i);
				}
			}
			//If we get to here in the code then the parameter node
			//has no empty children so check the leftmost child
			//Of this node to see if that has any empty children
			return this.getFirstSpace(node.getChildAt(0));
		}
	}
	//Delete key
	public void delete(int k){
		Node temp = this.search(k);
		if(temp != null){
			temp.parent.removeChild(temp);	
		}
	}
	
	public void getSize(){
		
	}
}