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
        {
          m_aState = Opened;
        }
      break;
      case Closed:
        {
          m_aState = Opened;
        }
      break;
    }
  }
  
  void close()
    switch(m_aState)
    {
      case Opened:
        {
          m_aState = Closed;
        }
      break;
    }
  }
  
};
/* Actifsource ID=[320fb063-ee5e-11ef-883f-ab05a42d3347,320f88bd-ee5e-11ef-883f-ab05a42d3347,otnA0cArmwbmNo9Ij197YLoUr+s=] */
