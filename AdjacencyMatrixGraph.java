public class AdjacencyMatrixGraph {
    private static final int EDGE_EXIST = 1;
    private static final int EDGE_NONE = 0;

    private int _numberOfVertices;
    private int _numberOfEdges;
    private int[][] _adjacency;

    public AdjacencyMatrixGraph(int givenNumberOfVertices){
        this.setNumberOfVertices(givenNumberOfVertices);
        this.setNumberOfEdges(0);
        this.setAdjacency(new int[givenNumberOfVertices][givenNumberOfVertices]);
        for(int tailVertex=0; tailVertex<this.numberOfVertices(); tailVertex++){
            for(int headVertex=0;headVertex<this.numberOfVertices(); headVertex++){
                this.adjacency()[tailVertex][tailVertex] = AdjacencyMatrixGraph.EDGE_NONE;
            }
        }
    }

    public void setNumberOfVertices(int _numberOfVertices) {
        this._numberOfVertices = _numberOfVertices;
    }

    public void setNumberOfEdges(int _numberOfEdges) {
        this._numberOfEdges = _numberOfEdges;
    }

    public void setAdjacency(int[][] _adjacency) {
        this._adjacency = _adjacency;
    }

    public int numberOfVertices(){
        return this._numberOfVertices;
    }
    public int numberOfEdges(){
        return this._numberOfEdges;
    }
    public int[][] adjacency(){
        return this._adjacency;
    }
    public boolean vertexDoesExist(int aVertex){
        return (aVertex >= 0 && aVertex < this.numberOfVertices());
    }
    private boolean adjacencyOfEdgeDoesExist(int tailVertex, int headVertex){
        return (this.adjacency()[tailVertex][headVertex] != AdjacencyMatrixGraph.EDGE_NONE);
    }
    public boolean edgeDoesExist(Edge anEdge){
        if(anEdge != null){
            int tailVertex = anEdge.tailVertex();
            int headVertex = anEdge.headVertex();
            if(this.vertexDoesExist(tailVertex) && this.vertexDoesExist(headVertex)){
                return (this.adjacencyOfEdgeDoesExist(tailVertex, headVertex));
            }
        }
        return false;
    }

    public boolean addEdge(Edge anEdge){
        if(anEdge != null){
            int tailVertex = anEdge.tailVertex();
            int headVertex = anEdge.headVertex();
            if(this.vertexDoesExist(tailVertex) && this.vertexDoesExist(headVertex)){
                if(!this.adjacencyOfEdgeDoesExist(tailVertex, headVertex))
                this.adjacency()[tailVertex][headVertex] = AdjacencyMatrixGraph.EDGE_EXIST;
                this.adjacency()[headVertex][tailVertex] = AdjacencyMatrixGraph.EDGE_EXIST;
                this.setNumberOfEdges(this.numberOfEdges()+1);
                return true;
            }
        }
        return false;
    }
}
