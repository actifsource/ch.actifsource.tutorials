class StatemachineImpl
{
private:
	enum {
	  Initalized,
	  Started,
	  Stopped
	} m_aState;
public:
  void start()
    switch(m_aState)
    {
      case Initalized:
        m_aState = Started;
      break;
      case Stopped:
        m_aState = Started;
      break;
    }
  }
  
  void stop()
    switch(m_aState)
    {
      case Started:
        m_aState = Stopped;
      break;
    }
  }
  
};
/* Actifsource ID=[dfbc0921-ee3e-11ef-8f14-2d157258da62,115f1346-ee37-11ef-9f0b-350e377473d3,vuo4JDzIZvsIDNniX9iXWZJnc/g=] */
