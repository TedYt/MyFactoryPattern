# MyFactoryPattern

1. 简单工厂模式
    根据调用这不同的要求，创建出不同的登录对象并返回。
    如果碰到不合法的要求，要返回一个Runtime异常
  
2. 工厂方法模式
    如果简单工厂模式处理的类型太多，会造成工厂类特别臃肿。
    这样就需要一种新的模式来处理。

    这个模式的核心是：为一个类型提供一个简单工厂类，例如
    代码实例中的ExportPdfFactory是ExportFinancialPdfFile 
    和ExportStandarPdfFile的工厂类，ExportHtmlFactory 是
    ExportFinancialHtmlFile 和 ExportStandarHtmlFile的工厂类。

    如果想要为Financial 和 Standard 增加 一种WordFile，那就不用
    修改现有的任何代码，直接增加一个3个类即可：

    class ExportWordFactory implements ExportFactory { ... }
    class ExportFinancialWordFile implements ExportFile { ... }
    class ExportStandarWordFile implements ExportFile { ... }

    由此可见这个模式的好处是 实现了高扩展性，同时也需要原有的任何代码