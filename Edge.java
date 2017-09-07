public class Edge {
    private int _tailVertex;
    private int _headVertex;
    public Edge(int givenTailVertex, int givenHeadVertex){
        this.setTailVertex(givenTailVertex);
        this.setHeadVertex(givenHeadVertex);
    }

    public int tailVertex() {
        return _tailVertex;
    }

    public void setTailVertex(int _tailVertex) {
        this._tailVertex = _tailVertex;
    }

    public int headVertex() {
        return _headVertex;
    }

    public void setHeadVertex(int _headVertex) {
        this._headVertex = _headVertex;
    }
}
