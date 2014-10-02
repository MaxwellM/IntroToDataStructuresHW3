/**
 * Created with IntelliJ IDEA.
 * User: Maxwell
 * Date: 11/4/13
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;

/*
 * Class representing a single data entry inside our
 * k-tree.
 */

public class Node {
	
	//K = Key value, D = data
	public int k;
	public float d;
	
	public int maxChildren;
	
	public Node parent;
	
	public List<Node> children = new LinkedList<Node>();
	
	public Node(int max){
		this.maxChildren = max;
	}
	
	public void setValues(int k,float d){
		this.k = k;
		this.d = d;
	}
	
	public void addChild(Node child){
		if(this.children.size() < maxChildren){
			this.children.add(child);
			child.parent = this;
		}
	}
	
	public void addChildAt(int index, Node child){
		if(index < this.maxChildren){
			this.children.add(index, child);
			child.parent = this;
		}
	}
	
	public Node getChildAt(int index){
		return this.children.get(index);
	}
	
	public List<Node> getChildren(){
		return this.children;
	}
	
	public int getNumberOfChildren(){
		return this.children.size();
	}
	
	//Has all the children it can have
	public boolean isFull(){
		if(this.maxChildren == this.getNumberOfChildren()){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean hasChildren(){
		if(this.children.size() > 0){
			return true;
		}
		return false;
	}
	
	public void removeChild(Node node){
		this.children.remove(node);
	}
	
	public void removeChildAt(int index, Node Child){
		this.children.remove(index);
	}
	
	public void removeChildren(){
		this.children.clear();
	}
}
