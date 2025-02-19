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
        if (m_startCounter < m_startLimit)
        {
          m_aState = Started;
          m_startCounter = m_startCounter + 1;
        }
      break;
      case Stopped:
        if (m_startCounter < m_startLimit)
        {
          m_aState = Started;
          m_startCounter = m_startCounter + 1;
        }
      break;
    }
  }
  
  void stop()
    switch(m_aState)
    {
      case Started:
        {
          m_aState = Stopped;
        }
      break;
    }
  }
  
};
/* Actifsource ID=[320fb063-ee5e-11ef-883f-ab05a42d3347,320f88b4-ee5e-11ef-883f-ab05a42d3347,+zYb2ZRjM1wW+0EGiFsuaI/xLGc=] */
