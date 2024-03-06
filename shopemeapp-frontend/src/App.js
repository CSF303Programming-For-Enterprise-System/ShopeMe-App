
import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
function App() {
  return (
        <div>
            <h1>Welcome to Shopme Admin Control Panel</h1>
            <div className="container-fluid">
                <div>
                    <nav className="navbar navbar-expand-lg bg-dark navbar-dark">
                        <a className="navbar-brand" href="/">
                            <img src="/images/ShopmeAdminSmall.png" alt="Shopme Admin" />
                        </a>
                        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#topNavbar">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="topNavbar">
                            <ul className="navbar-nav">
                                <li className="nav-item">
                                    <a className="nav-link" href="/users">Users</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/categories">Categories</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/brands">Brands</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/products">Products</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/customers">Customers</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/shipping">Shipping</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/orders">Orders</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/report">Sales Report</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/articles">Articles</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/menus">Menus</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/settings">Settings</a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
                <div>
                    <h1>Shopme Control Panel</h1>
                </div>
                <div>
                    <p>Shopme Control Panel - Copyright &copy; Shopme</p>
                </div>
            </div>
        </div>
);
};


export default App;
