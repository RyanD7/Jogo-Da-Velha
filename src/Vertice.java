import java.util.HashSet;
import java.util.Set;

public class Vertice {
    
    private Tabuleiro tabuleiroEstado;
    private Set<Vertice> verticesAdjacentes = new HashSet<Vertice>();
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
    
    public void setTabuleiroEstado(Tabuleiro tabuleiroEstado){
        this.tabuleiroEstado = tabuleiroEstado;
    } 
    
    public Tabuleiro getTabuleiroEstado() {
        return tabuleiroEstado;
    }
    
    //Add vertices Filhos a Vértice atual
    public void AdicionarVertice(Vertice vertice) {
        verticesAdjacentes.add(vertice);  
    }
}
