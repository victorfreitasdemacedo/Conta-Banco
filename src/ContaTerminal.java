public class ContaTerminal {
    
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    private String mensagem = "";

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String mensagemCriacaoConta(){
        this.mensagem = this.mensagem.concat("Olá ")
                .concat(this.nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(this.agencia)
                .concat(", conta ")
                .concat(Integer.toString(this.numero))
                .concat(" e seu saldo ")
                .concat(Double.toString(this.saldo))
                .concat(" já está disponível para saque.");
        return this.mensagem;
    }

}