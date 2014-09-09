/**
* code to read from StdIn in Java
* from lecture "Dynamic Connectivity"
**/

public static void main(String[] args)
{
    int N = StdIn.readInt();
    UF uf = new UF(N);

    while (!StdIn.isEmpty())
    {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        if (!uf.connected(p, q))
        {
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
    }
}