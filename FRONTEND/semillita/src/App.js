import './App.css'
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import FooterComponent from './components/FooterComponents';
import FormularioRegistroComponent from './components/FormularioRegistroComponent';
import HeaderNavComponent from './components/HeaderNavComponent';

const App = () => {
  return (
    
    <BrowserRouter>
    <HeaderNavComponent/>
      <Routes>
      <Route path='/home/registro' element={<FormularioRegistroComponent/>}></Route>
      </Routes>
      <FooterComponent/>
      </BrowserRouter>
      
  );
}

export default App;
