package com.company;

public class Main {

    public static void main(String[] args) {
        Haus haus = new Haus();

        haus.addListener(new Wohnzimmerlampe(false, "Wohnzimmerlampe1", new String[]{"L1", "LW1", "LS0"}, new String[]{"L0", "LW0", "H0"}));
        haus.addListener(new Wohnzimmerlampe(false, "Wohnzimmerlampe2", new String[]{"L1", "LW1", "LS0"}, new String[]{"L0", "LW0", "H0"}));
        haus.addListener(new Schlafzimmerlampe(false, "Schlafzimmerlampe1", new String[]{"L1", "LW0", "LS1"}, new String[]{"L0", "LS0", "H0"}));
        haus.addListener(new Schlafzimmerlampe(false, "Schlafzimmerlampe2", new String[]{"L1", "LW0", "LS1"}, new String[]{"L0", "LS0", "H0"}));
        haus.addListener(new Heizkoerper(false, "Heizkoerper1", new String[]{"H1"}, new String[]{"H0"}));
        haus.addListener(new Heizkoerper(false, "Heizkoerper2", new String[]{"H1"}, new String[]{"H0"}));

        haus.go();
    }
}
