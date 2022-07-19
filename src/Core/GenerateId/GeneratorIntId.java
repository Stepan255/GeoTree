package FamilyTree.src.Core.GenerateId;

import java.util.Random;

public class GeneratorIntId implements GenerateId {


        public int genId() {
            return new Random().nextInt(Integer.MAX_VALUE);
        }

}
