# 七大设计原则

## 1.单一职责原则

单一职责原则（Single Responsibility Principle，SRP）：一个类应该有且只有一个引起它变化的原因。这意味着一个类应该只负责一项职责，如果一个类承担了过多的职责，就会导致耦合性增加，使得修改变得困难。

## 2.开放封闭原则

开放封闭原则（Open-Closed Principle，OCP）：软件实体（类、模块、函数等）应该对扩展开放，对修改关闭。这意味着在添加新功能时，应该尽量使用扩展现有代码的方式，而不是修改已有代码。通过遵守该原则，可以提高代码的可维护性和可复用性。

## 3.里氏替换原则

里氏替换原则（Liskov Substitution Principle，LSP）：任何基类可以被其子类替换，而程序的行为不会发生变化。简单来说，子类应该能够替代父类并且不引起任何意外或异常行为。遵循该原则可以确保代码的正确性和稳定性。

## 4.依赖倒置原则

依赖倒置原则（Dependency Inversion Principle，DIP）：高层模块不应该依赖于低层模块，两者都应该依赖于抽象。抽象不应该依赖于具体实现细节，具体实现细节应该依赖于抽象。通过使用接口或抽象类，可以实现模块间的解耦和灵活性。

## 5.接口隔离原则

接口隔离原则（Interface Segregation Principle，ISP）：客户端不应该强迫依赖于它们不需要的接口。这意味着应该尽量使用小而专一的接口，而不是一个大而臃肿的接口。接口隔离原则有助于减少类之间的耦合度，提高系统的灵活性和可维护性。

## 6.迪米特法则

迪米特法则，又称最少知道原则（Law of Demeter，LoD）：一个对象应该对其他对象有最少的了解。一个类应该尽量减少对其他类的依赖，尽量只与直接的朋友通信。直接的朋友是指那些成员变量、方法参数、方法返回值等直接出现在当前类中的对象。

## 7.合成复用原则

合成复用原则（Composite/Aggregate Reuse Principle，CARP）：尽量使用对象组合，而不是继承来达到复用的目的。通过将已有对象组合在一起形成新的对象，可以灵活地增加或修改功能，而不需要修改现有代码。合成复用原则有助于降低类与类之间的耦合度，提高系统的灵活性和可维护性。