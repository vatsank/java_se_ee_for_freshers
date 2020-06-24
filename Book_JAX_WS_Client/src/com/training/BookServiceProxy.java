package com.training;

public class BookServiceProxy implements com.training.BookService {
  private String _endpoint = null;
  private com.training.BookService bookService = null;
  
  public BookServiceProxy() {
    _initBookServiceProxy();
  }
  
  public BookServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookServiceProxy();
  }
  
  private void _initBookServiceProxy() {
    try {
      bookService = (new com.training.BookServiceImplServiceLocator()).getBookServiceImplPort();
      if (bookService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookService != null)
      ((javax.xml.rpc.Stub)bookService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.training.BookService getBookService() {
    if (bookService == null)
      _initBookServiceProxy();
    return bookService;
  }
  
  public java.lang.String[] findBestBooks(java.lang.String srchTopic) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.findBestBooks(srchTopic);
  }
  
  
}