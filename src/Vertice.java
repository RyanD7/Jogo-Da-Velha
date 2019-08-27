import java.util.ArrayList;
import java.util.List;

public class Vertice {
    
    private Tabuleiro tabuleiroEstado;
    private List<Vertice> verticesAdjacentes = new ArrayList<Vertice>();
    private Vertice verticePai;
    private String jogadaText; // saber se é X ou O
    
    public String getJogadaText() {
        return jogadaText;
    }
    public void setJogadaText(String jogadaText) {
        this.jogadaText = jogadaText;
    }
    
    public Vertice getVerticePai() {
        return verticePai;
    }
    public void setVerticePai(Vertice verticePai){
        this.verticePai = verticePai;
    }
    
    public Tabuleiro getTabuleiroEstado() {
        return tabuleiroEstado;
    }
    //Add vertices Filhos a Vértice atual
    public void AdicionarVertice(Vertice vertice) {
        verticesAdjacentes.add(vertice);
        
        
    }
}
