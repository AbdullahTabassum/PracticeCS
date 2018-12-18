package Graphs.DisjointSet;

public class DisjointElement<T> {

    T item;
    DisjointElement parent;
    int size = 0;

    public DisjointElement find() {

        if(this.parent == null)
            return this;
        else
            return this.parent.find();
    }

    public static void union(DisjointElement e1, DisjointElement e2) {

        //check which DE is larger
        DisjointElement larger = getLarger(e1, e2);
        DisjointElement smaller = getSmaller(e1, e2);

        //add the smaller one to the larger one
        merge(larger, smaller);

    }

    private static DisjointElement getLarger(DisjointElement e1, DisjointElement e2) {
        return (e1.find().size >= e2.find().size ? e1 : e2);
    }

    private static DisjointElement getSmaller(DisjointElement e1, DisjointElement e2) {
        return (e1.find().size < e2.find().size ? e1 : e2);
    }

    private static void merge(DisjointElement larger, DisjointElement smaller) {
        DisjointElement rootLarger = larger.find();
        DisjointElement rootSmaller = smaller.find();

        int sizeSmaller = rootSmaller.size;

        rootLarger.size += sizeSmaller;

        rootSmaller.parent = rootLarger;
    }
}
