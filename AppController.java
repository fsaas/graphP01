public class AppController {
    private AdjacencyMatrixGraph _graph;

    public AppController(AdjacencyMatrixGraph _graph) {
        this.setGraph(null);
    }

    public AdjacencyMatrixGraph graph() {
        return _graph;
    }

    public void setGraph(AdjacencyMatrixGraph _graph) {
        this._graph = _graph;
    }

    private void inputAndMakeGraph(){

    }
    private void showGraph(){

    }
    public void run() {
        AppView.outputLine("<<< 입력되는 그래프의 사이클 검사를 시작합니다 >>>");
        this.inputAndMakeGraph();
        this.showGraph();
        AppView.outputLine("");
        AppView.outputLine("<<< 그래프의 입력과 사이클 검사를 종료합니다 >>>");
    }
}
