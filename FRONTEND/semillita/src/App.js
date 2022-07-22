import './App.css'
import './App2.css'
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import FooterComponent from './components/FooterComponents';
import FormularioRegistroComponent from './components/FormularioRegistroComponent';
import ContactoComponent from './components/ContactoComponent';
import HeaderNavComponent from './components/HeaderNavComponent';
import NosotrosComponent from './components/NosotrosComponent';
import LoginComponent from './components/LoginComponent';
import HomeComponent from './components/HomeComponent';
import JuegoHtmlComponent from './components/juego-html';
import AsignaturaComponent from './components/AsignaturaComponent';
import ModuloComponent from './components/ModuloComponent';
import EtapaComponent from './components/EtapaComponent';

const App = () => {
  return (
    
    <BrowserRouter>
    <HeaderNavComponent/>
      <Routes>
      <Route path='/' element={<HomeComponent/>}></Route>
      <Route path='registro' element={<FormularioRegistroComponent/>}></Route>
      <Route path='contacto' element={<ContactoComponent/>}></Route>
      <Route path='nosotros' element={<NosotrosComponent/>}></Route>
      <Route path='login' element={<LoginComponent/>}></Route>
      <Route path='asignatura' element={<AsignaturaComponent/>}></Route>
      <Route path='modulo' element={<ModuloComponent/>}></Route>
      <Route path='etapa' element={<EtapaComponent/>}></Route>
      <Route path="juego-html" element={<JuegoHtmlComponent/>}></Route>
      </Routes>
      <FooterComponent/>
    </BrowserRouter>
      
  );
}

export default App;
