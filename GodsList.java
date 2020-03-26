package gmsanubis.com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum GodsList {
    Achilles("w"),Agni("m"),AhMuzenCab("h"),AhPuch("m"),Amaterasu("w"),Anhur("h"),Anubis("m"),AoKuang("m"),Aphrodite("m"),Apollo("h"),Arachne("a"),Ares("g"),Artemis("h"),Artio("g"),Athena("g"),Awilix("a"),
    Bacchus("g"),Bakasura("a"),BaronSamedi("m"),Bastet("a"),Bellona("g"),
    Cabrakan("w"),Camazotz("a"),Cerberus("g"),Cernunnos("h"),Chaac("w"),Change("m"),Chernobog("h"),Chiron("h"),Chronos("m"),CuChulain("w"),Cupid("h"),
    Daji("a"),Discordia("m"),
    ErlangShen("w"),
    Fafnir("g"),Fenrir("a"),Freya("m"),
    Ganesha("g"),Geb("g"),GuanYu("w"),
    Hachiman("h"),Hades("m"),Hebo("m"),Hel("m"),Hera("m"),Hercules("w"),Horus("g"),Houyi("h"),HunBatz("a"),
    Isis("m"),Izanami("h"),
    Janus("m"),JingWei("h"),Jormungandr("g"),
    Kali("a"),Khepri("g"),KingArthur("w"),Kukulkan("m"),Kumbhakarna("g"),Kuzenbo("g"),
    Loki("a"),
    Medusa("h"),Mercury("a"),Merlin("m"),Mulan("w"),
    NeZha("a"),Neith("h"),Nemesis("a"),Nike("w"),Nox("m"),NuWa("m"),
    Odin("w"),Olorun("m"),Osiris("w"),
    Pele("a"),Persephone("m"),Poseidon("m"),
    Ra("m"),Raijin("m"),Rama("h"),Ratatoskr("a"),Ravana("a"),
    Scylla("m"),Serqet("a"),Set("a"),Skadi("h"),Sobek("g"),Sol("m"),SunWukong("w"),Susano("a"),Sylvanus("g"),
    Terra("g"),Thanatos("a"),TheMorrigan("m"),Thor("a"),Thoth("m"),Tyr("w"),
    Ullr("h"),
    Vamana("w"),Vulcan("m"),
    Xbalanque("h"),XingTian("g"),
    Yemoja("g"),Ymir("g"),
    Zeus("m"),ZongKhui("m");

    private String classe;

    GodsList (String classe){
        this.classe=classe;
    }

    public String getClasse(){
        return classe;
    }


}


