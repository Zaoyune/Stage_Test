import java.util.ArrayList;
import java.util.List;

class Solution_Node {

    public static int findNetworkEndpoint(int startNodeId ,int[] fromIds,int[] toIds) {
        List<Integer> List1 = new ArrayList<Integer>() {{ for (int i : toIds) add(i); }};
        List<Integer> fromIdsList = new ArrayList<Integer>() {{ for (int i : fromIds) add(i); }};

        if((toIds.length<= 0)||(toIds.length > 10000))
        {
            return 0;
        }


        boolean node = false;
        boolean finNode = false;
        boolean s = true;

        int nodes = startNodeId;
        int nodevaleur = Integer.MIN_VALUE;
        int lastindex = Integer.MIN_VALUE;

        while (!node && !finNode)
        {
            if (!s && (nodes == startNodeId))
            {
                finNode = true;
                nodevaleur = lastindex;
                break;
            }
            if(s)
            {
                s = false;
            }

            if(fromIdsList.contains(node))
            {
                lastindex = nodevaleur;
                nodevaleur = fromIdsList.indexOf(node);
                nodes = List1.get(nodevaleur);
            }
            else
            {
                node = true;
            }
        }
        return nodevaleur;
    }

    public static void main(String[] args) {
        int debutnode = 6;
        int n = 4;

        int[] fromIds = new int[] { 4, 9, 6, 1 };
        int[] toIds = new int[] { 9, 5, 1, 4 };
        System.out.println((debutnode));
        System.out.println(n);

        for (int i = 0; i < n; i++)
        {
            System.out.println(+ fromIds[i]+ " " + toIds[i]);
        }

        int finnode = findNetworkEndpoint(debutnode, fromIds, toIds);
        System.out.println("" + finnode);
    }
}
