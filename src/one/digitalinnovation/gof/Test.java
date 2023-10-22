package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.CepAPI;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.stratey.ComportamentoAgressivo;
import one.digitalinnovation.gof.stratey.ComportamentoDefensivo;
import one.digitalinnovation.gof.stratey.ComportamentoNormal;
import one.digitalinnovation.gof.stratey.Robo;

public class Test {
    public static void main(String[] args) {
        //  Singleton

        System.out.println("Singleton");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        CepAPI eager = CepAPI.getInstancia();
        System.out.println(eager);
        eager = CepAPI.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //  Strategy

        System.out.println("Strategy");
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        //  Facade
        System.out.println("Facade");

        Facade facade = new Facade();
        facade.migrarCliente("Venilton","1400888");
    }
}
