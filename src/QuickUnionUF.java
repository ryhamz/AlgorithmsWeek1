
public class QuickUnionUF {

	
	
	private int[] id;
	private int[] sz;
	
	//N is the number of objects
	public QuickUnionUF(int N){
	id = new int[N];
	sz = new int[N];
	//Set ID of each object to itself
	for (int i = 0; i < N; i++)
	{
		id[i] = i;
		sz[i] = 1;
	}
	}
	
	//iterates from child up to the root parent.	
	private int root(int i){
		while (i != id[i]){
			id[i] = id[id[i]];
			i = id[i];
		}
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
	if (i==j) return;
	if (sz[i] < sz[j])
	{ id[i] = j; sz[j] += sz[i];}
	else 
	{ id[j] = i; sz[i] += sz[j];}
	id[i] = j;
	}


		  public static void main(String[] args) {
		    QuickUnionUF testFind = new QuickUnionUF(8);
		    testFind.union(5,6);
		    boolean isConnected = testFind.connected(1,6);
		    System.out.println(isConnected ? "true" : "false");
		   
		  }
	
}


