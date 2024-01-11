package academy.devdojo.aulas.enumeracao.dominio;

/*private protected*/ public enum TipoPagamento {
    DEBITO {
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calculaDesconto(double valor); //método sem comportamento, passa a responsabilidade para as enums
//    public double calculaDesconto(double valor){
//        return 0;
//    }


    TipoPagamento() {
    }
}