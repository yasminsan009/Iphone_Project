
public class arquivosiPhone{
    
    interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }
    
    interface AparelhoTelefonico {
        void ligar();
        void atender();
        void iniciarCorreioVoz();
    }
    
    interface NavegadorInternet {
        void exibirPagina(String url);
        void adicionarNovaAba(String url);
        void atualizarPagina();
    }
    
    class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        public void tocar() {
            System.out.println("Tocar música");
        }
    
        public void pausar() {
            System.out.println("Pause");
        }
    
        public void selecionarMusica(String musica) {
            System.out.println("Seleciona música: " + musica);
        }
    
        public void ligar() {
            System.out.println("Ligando");
        }
    
        public void atender() {
            System.out.println("Atendeu chamada");
        }
    
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz");
        }
    
        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }
    
        public void adicionarNovaAba(String url) {
            System.out.println("Adicionar nova aba: " + url);
        }
    
        public void atualizarPagina() {
            System.out.println("Atualizar página");
        }
    }
    
    // Exemplo de uso
    public class Main {
        public static void main(String[] args) {
            arquivosiPhone meuiPhone = new arquivosiPhone();
            
            ((arquivosiPhone.ReprodutorMusical) meuiPhone).tocar();
            ((arquivosiPhone.AparelhoTelefonico) meuiPhone).atender();
            ((arquivosiPhone.NavegadorInternet) meuiPhone).exibirPagina(null);
        }
    }
    
    }
    