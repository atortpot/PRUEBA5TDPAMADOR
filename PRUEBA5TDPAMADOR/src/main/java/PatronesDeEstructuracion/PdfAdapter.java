package PatronesDeEstructuracion;
class PdfAdapter implements MediaAdapter {
    private PdfBook pdfBook;

    public PdfAdapter(PdfBook pdfBook) {
        this.pdfBook = pdfBook;
    }

    @Override
    public void play() {
        pdfBook.openPdf();
    }
}

