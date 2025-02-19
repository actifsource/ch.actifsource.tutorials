class StatemachineImpl
{
private:
	enum {
	  Initalized,
	  Opened,
	  Closed
	} m_aState;
public:
  void open()
    switch(m_aState)
    {
      case Initalized:
        m_aState = Opened;
      break;
      case Closed:
        m_aState = Opened;
      break;
    }
  }
  
  void close()
    switch(m_aState)
    {
      case Opened:
        m_aState = Closed;
      break;
    }
  }
  
};
/* Actifsource ID=[dfbc0921-ee3e-11ef-8f14-2d157258da62,9ddb2290-ee3b-11ef-8f14-2d157258da62,/IT7UdR7k8Do6GYlQfZEpkU/GX4=] */
