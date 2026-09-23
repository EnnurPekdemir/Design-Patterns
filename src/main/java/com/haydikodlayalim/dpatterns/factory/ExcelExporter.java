package com.haydikodlayalim.dpatterns.factory;

class ExcelExporter implements FileExporter {
    @Override
    public String export(String content) {
        return "Excel olarak dışa aktarıldı." + content;
    }

}
