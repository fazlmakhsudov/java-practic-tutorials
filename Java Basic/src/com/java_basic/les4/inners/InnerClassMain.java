package com.java_basic.les4.inners;

public class InnerClassMain {

    public static void main(String[] args) {
        System.out.println("==Мисоли класҳои дохилӣ==");
        OuterClass.InnerClass innerClassObj = new OuterClass().new InnerClass();

        innerClassObj.setInnerField(28d);
        innerClassObj.changeOuterFieldValue();
        innerClassObj.changeOuterFieldValueByOuterMethod(100);
        System.out.println();

        System.out.println("==Мисоли класҳои лонашуда (дохили статикӣ)==");
        OuterClass.InnerStaticClass innerStaticClassObj = new OuterClass.InnerStaticClass();

        innerStaticClassObj.setInnerStaticField(44d);
        innerStaticClassObj.changeOuterStaticFieldValue();

    }
}
