
public class QuickUnionUF {

	public static void main(String [] args){
	}
	
	private int[] id;
	
	//N is the number of objects
	public QuickUnionUF(int N){
	id = new int[N];
	//Set ID of each object to itself
	for (int i = 0; i < N; i++)
		id[i] = i;
	}
	
	//iterates from child up to the root parent.
	private int root(int i){
		while (i != id[i])
			i = id[i];
		return i;
	}
	
	
	//checks if p and q have the same root
	public boolean connected(int p, int q){
		return root(p) == root(q);
	}
	
	//change root of p to point to root of q
	public void union(int p, int q){
	int i = root(p);
	int j = root(q);
	id[i] = j;
}
	
}


