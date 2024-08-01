import React from 'react'

function ContentKasKelas() {
    return (
        <>
            <section className="content-header">
                <div className="content-wrapper">
                    {/* Content Header (Page header) */}

                    {/* Main content */}
                    <section className="content">
                        {/* Default box */}
                        <div className="card">
                            <div className="card-body">
                                <h2 class="card-subtitle mb-2">Tagihan Kas Kelas Bulan Agustus</h2>

                                <h4 class="card-text">Rp 10.000</h4>
                                <p class="card-text">Segera lakukan pembayaran sebelum tanggal 10 Agustus</p>

                                <button type="button" onClick={() => window.location.href = '/payment'} class="btn btn-primary">Bayar</button>

                            </div>



                            <div className="card-body">
                                <h3 class="text-center">Daftar Pembayaran Kas Kelas </h3>
                                <table class="table caption-top">
                                    <caption>List of users</caption>
                                    <thead>
                                        <tr>
                                            <th scope="col">NO</th>
                                            <th scope="col">Bulan</th>
                                            <th scope="col">Nominal</th>
                                            <th scope="col">Status</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="row">1</th>
                                            <td>Januari</td>
                                            <td>Rp 10.000</td>
                                            <td>Lunas</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">2</th>
                                            <td>Februari</td>
                                            <td>Rp 10.000</td>
                                            <td>Lunas</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">3</th>
                                            <td>Larry</td>
                                            <td>the Bird</td>
                                            <td>@twitter</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>

                        </div>
                        {/* /.card */}
                    </section>
                    {/* /.content */}
                </div>


            </section>
        </>
    )
}

export default ContentKasKelas