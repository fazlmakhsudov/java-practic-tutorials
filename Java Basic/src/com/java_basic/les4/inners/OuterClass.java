package com.java_basic.les4.inners;

public class OuterClass {

    private Integer outerField = 10;
    private static String outerStaticField = "outerStaticField";

    public void setOuterField(Integer value) {
        this.outerField = value;
    }

    public Integer getOuterField() {
        return this.outerField;
    }

    private void outerPrint(String message) {
        System.out.println(message);
        // объекти класи берунӣ ба усулҳо ва хосиятҳои класи дохилӣ дастрасӣ надорад
    }

    private static void outerStaticPrint(String message) {
        System.out.println(message);
        // объекти класи берунӣ ба усулҳо ва хосиятҳои класи лонашуда дастрасӣ надорад
    }

    public class InnerClass { // Эъломия класи дохилӣ

        private Double innerField;

        public void setInnerField(Double value) {
            this.innerField = value;
        }

        public void changeOuterFieldValue() {
            OuterClass.this.outerField = this.innerField.intValue();
            OuterClass.outerStaticField = "арзиши нав аз класи дохилӣ";
            outerPrint("арзишҳои outerField ва outerStaticField аз усули класи дохилӣ тағйир ёфт");
            outerPrint(String.format("outerField = %d, outerStaticField = '%s'", outerField, outerStaticField));
        }

        public void changeOuterFieldValueByOuterMethod(Integer value) {
            OuterClass.this.setOuterField(value);
            outerPrint(String.format("арзиши нав ба outerField = %d, ки бо усули берунй тагьир дода шудааст",
                    outerField));
        }

    }

    public static class InnerStaticClass { // Эъломия класи лонашуда

        private Double innerStaticField;

        public void setInnerStaticField(Double value) {
            this.innerStaticField = value;
        }

        public void changeOuterStaticFieldValue() {
            // Класи лонашуда танҳо ба хосиятҳои статикӣ ва усулҳои класи берунӣ дастрасӣ дорад
            OuterClass.outerStaticField = "арзиши нав аз хосияти статикии дохилӣ = " + innerStaticField;
            outerStaticPrint("арзиши outerStaticField-ро аз усули класи лонашуда (статикии дохилӣ) тағир дод");
            outerStaticPrint(String.format("outerStaticField = '%s'", outerStaticField));
        }

    }
}
